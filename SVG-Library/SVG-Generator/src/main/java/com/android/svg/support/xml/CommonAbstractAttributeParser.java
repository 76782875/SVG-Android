package com.android.svg.support.xml;


import com.android.svg.support.utils.Color;
import com.android.svg.support.utils.Dimen;
import com.android.svg.support.utils.SCU;

import org.dom4j.Attribute;
import org.dom4j.Element;

/**
 * We define some common methods here.
 *
 * @author Megatron King
 * @since 2016/9/1 9:40
 */

public abstract class CommonAbstractAttributeParser<T> implements IAttributeParser<T> {

    protected String parseString(Element element, String name) {
        Attribute attribute = element.attribute(name);
        return attribute == null ? null : attribute.getValue();
    }

    protected String parseString(Element element, String name, String defaultValue) {
        Attribute attribute = element.attribute(name);
        String value = attribute == null ? null : attribute.getValue();
        return value == null || value.trim().length() == 0 ? defaultValue : value;
    }

    protected float parseFloat(Element element, String name) {
        return parseFloat(element, name, 0.0f);
    }

    protected float parseFloat(Element element, String name, float defaultValue) {
        return SCU.parseFloat(parseString(element, name), defaultValue);
    }

    protected boolean parseBoolean(Element element, String name) {
        return parseBoolean(element, name, false);
    }

    protected boolean parseBoolean(Element element, String name, boolean defaultValue) {
        return SCU.parseBoolean(parseString(element, name), defaultValue);
    }

    protected int parseColor(Element element, String name) {
        return Color.convert(parseString(element, name));
    }

    protected int parseColor(Element element, String name, int defaultColor) {
        return Color.convert(parseString(element, name), defaultColor);
    }

    protected float parseDimen(Element element, String name) {
        return Dimen.convert(parseString(element, name));
    }
}
