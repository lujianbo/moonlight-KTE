package com.lujianbo.app.kte.impl;

import org.yaml.snakeyaml.Yaml;

import java.util.List;
import java.util.Map;

/**
 * Created by jianbo on 2017/3/23.
 */
public class Config {

    private String kafkaTopic;
    private String elasticIndex;
    private String elasticIndexType;
    private String maxBatchSize;
    private String workerThreadNumber;
    private List<String> elasticTransportAddress;
    private Map<String, String> kafkaConsumer;
    private Map<String, String> elasticSetting;

    public static Config readConfig() {
        Yaml yaml = new Yaml();
        return yaml.loadAs(Config.class.getClassLoader().getResourceAsStream("kte.yaml"), Config.class);
    }

    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public String getElasticIndex() {
        return elasticIndex;
    }

    public void setElasticIndex(String elasticIndex) {
        this.elasticIndex = elasticIndex;
    }

    public String getElasticIndexType() {
        return elasticIndexType;
    }

    public void setElasticIndexType(String elasticIndexType) {
        this.elasticIndexType = elasticIndexType;
    }

    public List<String> getElasticTransportAddress() {
        return elasticTransportAddress;
    }

    public void setElasticTransportAddress(List<String> elasticTransportAddress) {
        this.elasticTransportAddress = elasticTransportAddress;
    }

    public String getMaxBatchSize() {
        return maxBatchSize;
    }

    public void setMaxBatchSize(String maxBatchSize) {
        this.maxBatchSize = maxBatchSize;
    }

    public String getWorkerThreadNumber() {
        return workerThreadNumber;
    }

    public void setWorkerThreadNumber(String workerThreadNumber) {
        this.workerThreadNumber = workerThreadNumber;
    }

    public Map<String, String> getKafkaConsumer() {
        return kafkaConsumer;
    }

    public void setKafkaConsumer(Map<String, String> kafkaConsumer) {
        this.kafkaConsumer = kafkaConsumer;
    }

    public Map<String, String> getElasticSetting() {
        return elasticSetting;
    }

    public void setElasticSetting(Map<String, String> elasticSetting) {
        this.elasticSetting = elasticSetting;
    }

    @Override
    public String toString() {
        return "Config{" +
                "kafkaTopic='" + kafkaTopic + '\'' +
                ", elasticIndex='" + elasticIndex + '\'' +
                ", elasticIndexType='" + elasticIndexType + '\'' +
                ", elasticTransportAddress=" + elasticTransportAddress +
                ", kafkaConsumer=" + kafkaConsumer +
                ", elasticSetting=" + elasticSetting +
                '}';
    }
}
