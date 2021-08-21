# About this project

The goal of this project is to showcase a possible implementation of a hexagonal architecture (aka "Ports & Adapters")
using Kotlin and Spring Boot. The project is divided into three modules:

## hex-domain

Contains all business logic - `UserManager` - the interfaces for the outside world (the ports) and the models.
Usually, this project would contain most of our unit tests

## hex-infrastructure

Contains all implementation details (adapters) for the ports described in the `hex-domain` project

## hex-api

The API itself. It uses Spring's dependency injection capabilities to wire all stuff from `hex-api`
and `hex-domain`. Here we could add integration tests, for example.