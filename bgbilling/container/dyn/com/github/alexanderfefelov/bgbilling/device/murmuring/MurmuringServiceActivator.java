package com.github.alexanderfefelov.bgbilling.device.murmuring;

import com.github.alexanderfefelov.bgbilling.device.framework.Loggable;
import com.github.alexanderfefelov.bgbilling.device.framework.Utils;
import ru.bitel.bgbilling.modules.inet.access.sa.ServiceActivator;
import ru.bitel.bgbilling.modules.inet.access.sa.ServiceActivatorEvent;
import ru.bitel.bgbilling.modules.inet.api.common.bean.InetDevice;
import ru.bitel.bgbilling.modules.inet.api.common.bean.InetDeviceType;
import ru.bitel.bgbilling.server.util.Setup;
import ru.bitel.common.ParameterMap;

public class MurmuringServiceActivator implements ServiceActivator,
        Loggable, Utils {

    @Override
    public Object init(Setup setup, int moduleId, InetDevice device, InetDeviceType deviceType, ParameterMap config) {
        logger().trace("init: [" + device.getId() + "] " + device.toString() + " " + removeNewLines(config.toString()));

        this.device = device;
        this.config = config;

        return true;
    }

    @Override
    public Object destroy() {
        logger().trace("destroy: [" + device.getId() + "] " + device.toString());

        return true;
    }

    @Override
    public Object connect() {
        logger().trace("connect: [" + device.getId() + "] " + device.toString());

        return true;
    }

    @Override
    public Object disconnect() {
        logger().trace("disconnect: [" + device.getId() + "] " + device.toString());

        return true;
    }

    @Override
    public Object serviceCreate(ServiceActivatorEvent event) {
        logger().trace("serviceCreate: [" + device.getId() + "] " + device.toString() + ", " + event.toString());

        return true;
    }

    @Override
    public Object serviceModify(ServiceActivatorEvent event) {
        logger().trace("serviceModify: [" + device.getId() + "] " + device.toString() + ", " + event.toString());

        return true;
    }

    @Override
    public Object serviceCancel(ServiceActivatorEvent event) {
        logger().trace("serviceCancel: [" + device.getId() + "] " + device.toString() + ", " + event.toString());

        return true;
    }

    @Override
    public Object connectionModify(ServiceActivatorEvent event) {
        logger().trace("connectionModify: [" + device.getId() + "] " + device.toString() + ", " + event.toString());

        return true;
    }

    @Override
    public Object connectionClose(ServiceActivatorEvent event) {
        logger().trace("connectionClose: [" + device.getId() + "] " + device.toString() + ", " + event.toString());

        return true;
    }

    @Override
    public Object onAccountingStart(ServiceActivatorEvent event) {
        logger().trace("onAccountingStart: [" + device.getId() + "] " + device.toString() + ", " + event.toString());

        return true;
    }

    @Override
    public Object onAccountingStop(ServiceActivatorEvent event) {
        logger().trace("onAccountingStop: [" + device.getId() + "] " + device.toString() + ", " + event.toString());

        return true;
    }

    private InetDevice device;
    private ParameterMap config;

}
