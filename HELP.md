# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.template.demo-project' is invalid and this project uses 'com.example.template.demo_project' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.0-SNAPSHOT/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.0-SNAPSHOT/gradle-plugin/packaging-oci-image.html)
* [Coroutines section of the Spring Framework Documentation](https://docs.spring.io/spring/docs/6.2.0-M7/spring-framework-reference/languages.html#coroutines)
* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/3.4.0-SNAPSHOT/reference/testing/testcontainers.html#testing.testcontainers)
* [Testcontainers MongoDB Module Reference Guide](https://java.testcontainers.org/modules/databases/mongodb/)
* [Testcontainers R2DBC support Reference Guide](https://java.testcontainers.org/modules/databases/r2dbc/)
* [Testcontainers Kafka Modules Reference Guide](https://java.testcontainers.org/modules/kafka/)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Docker Compose Support](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#features.docker-compose)
* [Testcontainers](https://java.testcontainers.org/)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Resilience4J](https://docs.spring.io/spring-cloud-circuitbreaker/docs/current/reference/html/#configuring-resilience4j-circuit-breakers)
* [Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer)
* [Reactive Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Config Server](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#actuator)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#howto.batch)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#messaging.kafka)
* [Apache Kafka Streams Support](https://docs.spring.io/spring-kafka/docs/current/reference/html/#streams-kafka-streams)
* [Apache Kafka Streams Binding Capabilities of Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/index.html#_kafka_streams_binding_capabilities_of_spring_cloud_stream)
* [Spring Data Reactive MongoDB](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#data.nosql.mongodb)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#data.nosql.mongodb)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#data.nosql.redis)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#data.sql.r2dbc)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#data.sql.jdbc)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.flyway)
* [OAuth2 Authorization Server](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#web.security.oauth2.authorization-server)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#web.graphql)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#web)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.4.0-SNAPSHOT/reference/htmlsingle/index.html#web.reactive)

### Guides
The following guides illustrate how to use some features concretely:

* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Samples for using Apache Kafka Streams with Spring Cloud stream](https://github.com/spring-cloud/spring-cloud-stream-samples/tree/master/kafka-streams-samples)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Accessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [R2DBC Homepage](https://r2dbc.io)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* mongodb: [`mongo:latest`](https://hub.docker.com/_/mongo)
* redis: [`redis:latest`](https://hub.docker.com/_/redis)

Please review the tags of the used images and set them to the same as you're running in production.

## Missing R2DBC Driver

Make sure to include a [R2DBC Driver](https://r2dbc.io/drivers/) to connect to your database.
### Testcontainers support

This project uses [Testcontainers at development time](https://docs.spring.io/spring-boot/3.4.0-SNAPSHOT/reference/features/dev-services.html#features.dev-services.testcontainers).

Testcontainers has been configured to use the following Docker images:

* [`confluentinc/cp-kafka:latest`](https://hub.docker.com/r/confluentinc/cp-kafka)
* [`mongo:latest`](https://hub.docker.com/_/mongo)
* [`redis:latest`](https://hub.docker.com/_/redis)

Please review the tags of the used images and set them to the same as you're running in production.

