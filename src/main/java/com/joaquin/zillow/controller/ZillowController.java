package com.joaquin.zillow.controller;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.joaquin.zillow.model.SearchResults;
import com.joaquin.zillow.model.ZillowResponse;

@Component
@Path("/zillow")
public class ZillowController {
	
	@Value("${ApplicationKey}")
	private String zwsId;
	
	@Value("${URLEncoding}")
	private String urlEncoding;
	
	@Value("${GetZestimateURL}")
	private String getZestimateURL;
	
	@Value("${GetDeepSearchResultsURL}")
	private String getDeepSearchResultsURL;
	
	//Zillow Key Params
    public static final String ZILLOW_APPLICATION_ID = "ApplicationKey";
    
    private static Client zillowClient;

    public static Client getDefaultZillowClient() {
    		if(zillowClient != null) {
    			return zillowClient;
    		}
    		else {
    			zillowClient = ClientBuilder.newBuilder()
    					.register(JacksonFeature.class)
    					.build();
    			return zillowClient;
    		}
    }
    
    
    /*
     * Quick Zesimate lookup by zpid
     */
	@Path("/zestimate/{zpid}")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public ZillowResponse getZestimateByZpid(@PathParam("zpid") String zpid) {
		Map<String, String> queryParams = new LinkedHashMap<String, String>();
		queryParams.put("zws-id", zwsId);
		queryParams.put("zpid", zpid);
        return getZestimateResponse(queryParams);
    }
	
	/*
	 * Basic Property search by Address and City/State or Zip
	 */
	@Path("/searchresults")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public SearchResults getDeepSearchResults(@QueryParam("address") String address, @QueryParam("citystatezip") String citystateZip) {
		Map<String, String> queryParams = new LinkedHashMap<String, String>();
		queryParams.put("zws-id", zwsId);
		queryParams.put("address", address);
		queryParams.put("citystatezip", citystateZip);
		return getSearchResults(queryParams);
	}
	
	protected ZillowResponse getZestimateResponse(Map<String, String> params) {
		Client zillowClient = getDefaultZillowClient();
		UriBuilder zillowURIBuilder = UriBuilder.fromPath(getZestimateURL);
		for(String param : params.keySet()) {
			zillowURIBuilder.queryParam(param, params.get(param));
		}
		
		URI uri  = zillowURIBuilder.build();
		final ZillowResponse response = zillowClient.target(uri.toString())
				.request(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.get(ZillowResponse.class);	
		return response;
	}
	
	protected SearchResults getSearchResults(Map<String, String> params) {
		Client zillowClient = getDefaultZillowClient();
		UriBuilder zillowURIBuilder = UriBuilder.fromPath(getDeepSearchResultsURL);
		for(String param : params.keySet()) {
			zillowURIBuilder.queryParam(param, params.get(param));
		}
		SearchResults response = null;
		try {
			URI uri  = zillowURIBuilder.build();
			response = zillowClient.target(uri.toString())
					.request(MediaType.APPLICATION_JSON)
					.accept(MediaType.APPLICATION_JSON)
					.get(SearchResults.class);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return response;
	}
}

