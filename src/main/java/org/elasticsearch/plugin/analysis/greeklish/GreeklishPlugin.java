package org.elasticsearch.plugin.analysis.greeklish;

import org.elasticsearch.indices.analysis.AnalysisModule.AnalysisProvider;
import org.elasticsearch.index.analysis.TokenFilterFactory;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;

import org.elasticsearch.index.analysis.GreeklishTokenFilterFactory;

import java.util.Map;

import static java.util.Collections.singletonMap;

public class GreeklishPlugin extends Plugin implements AnalysisPlugin {

    // Use singletonMap to register our token filter,
    // since we only have one in our plugin.
    @Override
    public Map<String, AnalysisProvider<TokenFilterFactory>> getTokenFilters() {
        return singletonMap("greeklish_filter", GreeklishTokenFilterFactory::new);
    }
}