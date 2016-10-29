This is an example of using h2 with and without spring security enabled.
Also is an example of loading data on spring startup (see application.properties)
H2 maven dependency can't be in runtime, take away the call and it will default to runtime.
Set up the datasource in application properties.

For Security:
Set up securityconfiguration and webconfiguration.