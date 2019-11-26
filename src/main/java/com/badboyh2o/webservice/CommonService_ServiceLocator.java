/**
 * CommonService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.badboyh2o.webservice;

public class CommonService_ServiceLocator extends org.apache.axis.client.Service implements com.badboyh2o.webservice.CommonService_Service {

    public CommonService_ServiceLocator() {
    }


    public CommonService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommonService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommonServiceImpPort
    private java.lang.String CommonServiceImpPort_address = "http://localhost:8080/services/CommonService";

    public java.lang.String getCommonServiceImpPortAddress() {
        return CommonServiceImpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommonServiceImpPortWSDDServiceName = "CommonServiceImpPort";

    public java.lang.String getCommonServiceImpPortWSDDServiceName() {
        return CommonServiceImpPortWSDDServiceName;
    }

    public void setCommonServiceImpPortWSDDServiceName(java.lang.String name) {
        CommonServiceImpPortWSDDServiceName = name;
    }

    public com.badboyh2o.webservice.CommonService_PortType getCommonServiceImpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommonServiceImpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommonServiceImpPort(endpoint);
    }

    public com.badboyh2o.webservice.CommonService_PortType getCommonServiceImpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.badboyh2o.webservice.CommonServiceSoapBindingStub _stub = new com.badboyh2o.webservice.CommonServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCommonServiceImpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommonServiceImpPortEndpointAddress(java.lang.String address) {
        CommonServiceImpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.badboyh2o.webservice.CommonService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.badboyh2o.webservice.CommonServiceSoapBindingStub _stub = new com.badboyh2o.webservice.CommonServiceSoapBindingStub(new java.net.URL(CommonServiceImpPort_address), this);
                _stub.setPortName(getCommonServiceImpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CommonServiceImpPort".equals(inputPortName)) {
            return getCommonServiceImpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.badboyh2o.com/", "CommonService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.badboyh2o.com/", "CommonServiceImpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommonServiceImpPort".equals(portName)) {
            setCommonServiceImpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
