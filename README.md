# random-spring-quotes-graphql

A Spring boot Graphql repository to wrap around a rest webservice.

Step 1: Clone the Repo - https://github.com/arunvasudevan/random-spring-quotes-graphql.git

Step 2: mvn spring-boot:run

Step 3: http://localhost:8080/graphql

```{
getRandomQuote {
  value {
    quote
  }
  }
}```

You should see the below output:
```{
  "data": {
    "getRandomQuote": {
      "value": {
        "quote": "Previous to Spring Boot, I remember XML hell, confusing set up, and many hours of frustration."
      }
    }
  }
}```

This application uses this REST webservice - https://gturnquist-quoters.cfapps.io/api/random to populate the data

