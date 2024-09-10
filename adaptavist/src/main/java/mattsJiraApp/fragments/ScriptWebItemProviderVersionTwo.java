package mattsJiraApp.fragments;

import com.atlassian.plugin.web.api.WebItem;
import com.atlassian.plugin.web.api.descriptors.WebItemProviderModuleDescriptor;
import com.atlassian.plugin.web.api.provider.WebItemProvider;

import javax.annotation.Nonnull;
import java.util.Map;

import static java.util.Collections.singleton;

public class ScriptWebItemProviderVersionTwo implements WebItemProvider {

    private WebItemProviderModuleDescriptor<WebItemProvider> moduleDescriptor;

    @Override
    public void init(@Nonnull final WebItemProviderModuleDescriptor<WebItemProvider> moduleDescriptor) {
        WebItemProvider.super.init(moduleDescriptor);

        this.moduleDescriptor = moduleDescriptor;
    }

    @Override
    public Iterable<WebItem> getItems(Map<String, Object> context) {
        return singleton(new WebItem() {
            @Nonnull
            @Override
            public String getSection() {
                return moduleDescriptor.getSection();
            }

            @Nonnull
            @Override
            public String getUrl() {
                return "https://www.google.com";
            }

            @Override
            public String getAccessKey() {
                return "";
            }

            @Override
            public String getEntryPoint() {
                return "";
            }

            @Override
            public String getCompleteKey() {
                return "some-key";
            }

            @Override
            public String getLabel() {
                return "some-label";
            }

            @Override
            public String getTitle() {
                return "some-title";
            }

            @Override
            public String getStyleClass() {
                return "some-style";
            }

            @Override
            public String getId() {
                return "";
            }

            @Nonnull
            @Override
            public Map<String, String> getParams() {
                var result = moduleDescriptor.getParams();
                System.out.println("getParams: " + result);
                return result;
            }

            @Override
            public int getWeight() {
                return 1;
            }
        });
    }
}
