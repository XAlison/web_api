package com.seejoke.micro.configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 将默认的json解析修改成fastjson
 *
 * @author yangzhongying
 * @date 2018/11/12 15:04
 */
@Configuration
public class MvcConfigurationSupport extends WebMvcConfigurationSupport {
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    super.configureMessageConverters(converters);
    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    // 指定fastjson支持类型
    List<MediaType> supportedMediaTypes = new ArrayList<>();
    supportedMediaTypes.add(MediaType.APPLICATION_JSON);
    supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
    supportedMediaTypes.add(MediaType.APPLICATION_ATOM_XML);
    supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
    supportedMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
    supportedMediaTypes.add(MediaType.APPLICATION_PDF);
    supportedMediaTypes.add(MediaType.APPLICATION_RSS_XML);
    supportedMediaTypes.add(MediaType.APPLICATION_XHTML_XML);
    supportedMediaTypes.add(MediaType.APPLICATION_XML);
    supportedMediaTypes.add(MediaType.IMAGE_GIF);
    supportedMediaTypes.add(MediaType.IMAGE_JPEG);
    supportedMediaTypes.add(MediaType.IMAGE_PNG);
    supportedMediaTypes.add(MediaType.TEXT_EVENT_STREAM);
    supportedMediaTypes.add(MediaType.TEXT_HTML);
    supportedMediaTypes.add(MediaType.TEXT_MARKDOWN);
    supportedMediaTypes.add(MediaType.TEXT_PLAIN);
    supportedMediaTypes.add(MediaType.TEXT_XML);
    fastConverter.setSupportedMediaTypes(supportedMediaTypes);
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(
        SerializerFeature.PrettyFormat,
        SerializerFeature.WriteMapNullValue,
        SerializerFeature.SortField);

    fastConverter.setFastJsonConfig(fastJsonConfig);
    converters.add(fastConverter);
  }
}
