package org.hpccsystems.dashboard.manage;

import org.hpccsystems.dashboard.entity.Dashboard;
import org.hpccsystems.dashboard.entity.widget.Widget;
import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Div;

public class WidgetConfiguration {
    public static final String ON_CHART_TYPE_SELECT = "onChartTypeSelect";
    public static final String ON_FILE_SELECT = "onFileSelect";
    
    private Dashboard dashboard;
    private Component holder;
    private Widget widget;
    private Div chartDiv;
   

    public Div getChartDiv() {
        return chartDiv;
    }

    public void setChartDiv(Div chartDiv) {
        this.chartDiv = chartDiv;
    }

    public WidgetConfiguration(Dashboard dashboard,Div chartDiv) {
        this.dashboard = dashboard;
        this.chartDiv = chartDiv;
    }

    public Widget getWidget() {
        return widget;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public Component getHolder() {
        return holder;
    }

    public void setHolder(Component holder) {
        this.holder = holder;
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }
}
