package com.wanderlog.clientscommon.configuration

import org.springframework.beans.factory.annotation.Configurable
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@Configurable
class ClientConfiguration {
}