package org.ionnic.common.util;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.ionnic.common.Config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author apple
 *
 */
@SuppressWarnings("unchecked")
public abstract class JsonUtils {

    private static final String DEFAULT_JSON = "{}";

    private static Gson gson;

    /**
     * @param json
     * @return
     */
    public static Map<String, Object> fromJson( String json ) {
        return fromJson(json, HashMap.class);
    }

    /**
     * @param json
     * @param clazz
     * @return
     */
    public static <T> T fromJson( String json, Class<T> clazz ) {
        if (json == null) {
            return null;
        }
        return getGson().fromJson(json, clazz);
    }

    /**
     * @param json
     * @param type
     * @return
     */
    public static <T> T fromJson( String json, Type type ) {
        if (json == null) {
            return null;
        }
        return (T) getGson().fromJson(json, type);
    }

    /**
     * @return
     */
    public static Gson getGson() {
        if (gson == null) {
            GsonBuilder gb = new GsonBuilder();
            gb.serializeNulls();
            gb.disableHtmlEscaping();
            // gb.generateNonExecutableJson();
            gb.setDateFormat(Config.DATE_FORMAT);

            gson = gb.create();
        }
        return gson;
    }

    /**
     * @param src
     * @return
     */
    public static String toJson( Object src ) {
        try {
            return getGson().toJson(src);
        } catch (Exception e) {

        }
        return DEFAULT_JSON;
    }
}
