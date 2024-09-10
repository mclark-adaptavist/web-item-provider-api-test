
`atlas-mvn jira:debug -f pom.xml`

or 

You can run it from IntelliJ idea's maven tool window using the plugins > jira > jira:debug maven goal

Make sure when Jira is started, create a sample project with issues then try to open the issues dropdown in the main navigation bar.
Then watch the log file `adaptavist/target/jira/home/log/atlassian-jira.log` when you trigger the web item provider to render and you 
will see the null pointer error I am referring to.

```
Caused by: java.lang.NullPointerException: Cannot invoke "com.atlassian.plugin.web.api.descriptors.WebItemProviderModuleDescriptor.getParams()" because the return value of "mattsJiraApp.fragments.ScriptWebItemProviderVersionTwo.access$000(mattsJiraApp.fragments.ScriptWebItemProviderVersionTwo)" is null
	at mattsJiraApp.fragments.ScriptWebItemProviderVersionTwo$1.getParams(ScriptWebItemProviderVersionTwo.java:76)
```