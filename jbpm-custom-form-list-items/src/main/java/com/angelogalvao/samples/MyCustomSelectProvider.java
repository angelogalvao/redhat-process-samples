package com.angelogalvao.samples;


import org.kie.workbench.common.forms.dynamic.model.config.SelectorData;
import org.kie.workbench.common.forms.dynamic.model.config.SelectorDataProvider;
import org.kie.workbench.common.forms.dynamic.service.shared.FormRenderingContext;

import javax.enterprise.context.Dependent;
import java.util.HashMap;
import java.util.Map;

/**
 * This class implements the dynamic list provider.
 *
 * @author <a href="mailto:angelogalvao@gmail.com">Ângelo Galvão</a>
 */
@Dependent
public class MyCustomSelectProvider implements SelectorDataProvider {

    private Map<String, String> values = new HashMap<>();

    public MyCustomSelectProvider(){
        values.put("001","Value 001");
        values.put("002","Value 002");
        values.put("003","Value 003");
    }

    @Override
    public String getProviderName() {
        return this.getClass().getName();
    }

    @Override
    public SelectorData<String> getSelectorData(FormRenderingContext formRenderingContext) {
        SelectorData data = new SelectorData(values, "001");

        return data;
    }

}
