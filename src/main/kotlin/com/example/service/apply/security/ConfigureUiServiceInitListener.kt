package com.example.service.apply.security

import com.vaadin.flow.router.BeforeEnterEvent
import com.vaadin.flow.server.ServiceInitEvent
import com.vaadin.flow.server.VaadinServiceInitListener
import org.springframework.stereotype.Component

@Component
class ConfigureUiServiceInitListener : VaadinServiceInitListener{
    override fun serviceInit(event: ServiceInitEvent?) {
        TODO("Not yet implemented")
    }

    private fun authenticateNavigation(event: BeforeEnterEvent){
    }
}