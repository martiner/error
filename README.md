# Wrong response code from @ExceptionHandler without 'reason' parameter

1. set `@ExceptionHandler` in a controller for a specific exception
1. set `@ResponseStatus` for a specific response code
1. return a JSP view
1. wrong response code is returned (500 with Jetty 9, 200 with Jetty 8)

With the `reason` parametr in `@ResponseStatus` correct status code is returned.

## Test case

```
mvn verify
```