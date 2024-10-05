https://github.com/gradle/dpeuni-gradle-incremental-and-caching-local
https://github.com/gradle/dpeuni-gradle-remote-caching/tree/solution
https://docs.gradle.com/develocity/gradle-plugin/current/#authenticating
https://dpeuniversity-develocity.gradle.com/settings/access-keys
https://docs.gradle.com/develocity/maven-extension/current/#authenticating

$ ./gradlew :app:clean :app:test -i
...
...
...
> Task :app:test FROM-CACHE
Build cache key for task ':app:test' is 5eea5b00209094c7c5d641d592af0a2b
Task ':app:test' is not up-to-date because:
Output property 'binaryResultsDirectory' file /Users/adayal/trainings/dpeuni-gradle-incremental-and-caching-local/app/build/test-results/test/binary has been removed.
Output property 'binaryResultsDirectory' file /Users/adayal/trainings/dpeuni-gradle-incremental-and-caching-local/app/build/test-results/test/binary/output.bin has been removed.
Output property 'binaryResultsDirectory' file /Users/adayal/trainings/dpeuni-gradle-incremental-and-caching-local/app/build/test-results/test/binary/output.bin.idx has been removed.
Output property 'binaryResultsDirectory' file /Users/adayal/trainings/dpeuni-gradle-incremental-and-caching-local/app/build/test-results/test/binary/results.bin has been removed.
Output property 'reports.enabledReports.html.outputLocation' file /Users/adayal/trainings/dpeuni-gradle-incremental-and-caching-local/app/build/reports/tests/test has been removed.
Loaded cache entry for task ':app:test' with cache key 5eea5b00209094c7c5d641d592af0a2b