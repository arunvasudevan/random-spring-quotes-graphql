package com.graphqljava.tutorial;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

    public DataFetcher getRandomQuoteDataFetcher() {
        return dataFetchingEnvironment -> {
            RestTemplate restTemplate = new RestTemplate();
            Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
            return quote;
        };
    }
}
