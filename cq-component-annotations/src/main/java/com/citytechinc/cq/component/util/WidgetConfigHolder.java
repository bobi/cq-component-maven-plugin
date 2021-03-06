package com.citytechinc.cq.component.util;

import com.citytechinc.cq.component.dialog.AbstractWidget;
import com.citytechinc.cq.component.dialog.maker.WidgetMaker;

/**
 * A container for the elements of configuration which define a Widget.
 *
 * @see com.citytechinc.cq.component.annotations.config.Widget
 * @see com.citytechinc.cq.component.dialog.AbstractWidget
 * @see com.citytechinc.cq.component.dialog.maker.WidgetMaker
 */
public class WidgetConfigHolder {

    private final Class<?> annotationClass;

    private final Class<? extends AbstractWidget> widgetClass;

    private final Class<? extends WidgetMaker> makerClass;

    private final String xtype;

    private final int ranking;

    private final String featureFlag;

    /**
     * @param annotationClass
     * @param widgetClass
     * @param makerClass
     * @param xtype
     * @param ranking
     */
    public WidgetConfigHolder(Class<?> annotationClass, Class<? extends AbstractWidget> widgetClass,
        Class<? extends WidgetMaker> makerClass, String xtype, int ranking, String featureFlag) {
        this.annotationClass = annotationClass;
        this.widgetClass = widgetClass;
        this.makerClass = makerClass;
        this.xtype = xtype;
        this.ranking = ranking;
        this.featureFlag = featureFlag;
    }

    public Class<?> getAnnotationClass() {
        return annotationClass;
    }

    public Class<? extends AbstractWidget> getWidgetClass() {
        return widgetClass;
    }

    public Class<? extends WidgetMaker> getMakerClass() {
        return makerClass;
    }

    public String getXtype() {
        return xtype;
    }

    public int getRanking() {
        return ranking;
    }

    public boolean hasMakerClass() {
        return makerClass != null;
    }

    public boolean hasXtype() {
        return xtype != null;
    }

    public String getFeatureFlag() {
        return featureFlag;
    }
}
