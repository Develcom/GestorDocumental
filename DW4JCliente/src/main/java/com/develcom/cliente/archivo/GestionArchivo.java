/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.cliente.archivo;

import java.nio.charset.Charset;
import java.util.Collections;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author familia
 */
public class GestionArchivo {

    public void almacenarArchivo() {

        RestTemplate restTemplate = new RestTemplate();
        FormHttpMessageConverter formConverter = new FormHttpMessageConverter();
        formConverter.setCharset(Charset.forName("UTF8"));
        restTemplate.getMessageConverters().add(formConverter);
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        restTemplate.setRequestFactory(new HttpComponentsClientHttpRequestFactory());

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
//        httpHeaders.setAccept(Collections.singletonList(MediaType.parseMediaType("multipart/form-data")));
        httpHeaders.setAccept(Collections.singletonList(MediaType.parseMediaType("application/json")));

        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<>();
        parts.add("file", new FileSystemResource("C:\\Users\\Public\\Pictures\\Sample Pictures\\test.mp4"));

//        parts.add(Constants.STATION_PROFILE_IMAGE_FILE, new FileSystemResource(stationImage.getImageFile()));
//        parts.add(Constants.STATION_PROFILE_IMAGE_URI, stationImage.getImageUri());
//        parts.add(Constants.STATION_PROFILE_IMAGE_TYPE, stationImage.getImageType());
//        parts.add(Constants.FIELD_STATION_ID, stationImage.getStationId());
        restTemplate.postForObject("url", parts, Boolean.class);
    }
}
