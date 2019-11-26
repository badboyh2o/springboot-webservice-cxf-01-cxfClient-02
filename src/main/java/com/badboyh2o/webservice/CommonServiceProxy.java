package com.badboyh2o.webservice;

public class CommonServiceProxy implements com.badboyh2o.webservice.CommonService_PortType {
  private String _endpoint = null;
  private com.badboyh2o.webservice.CommonService_PortType commonService_PortType = null;
  
  public CommonServiceProxy() {
    _initCommonServiceProxy();
  }
  
  public CommonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCommonServiceProxy();
  }
  
  private void _initCommonServiceProxy() {
    try {
      commonService_PortType = (new com.badboyh2o.webservice.CommonService_ServiceLocator()).getCommonServiceImpPort();
      if (commonService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)commonService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)commonService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (commonService_PortType != null)
      ((javax.xml.rpc.Stub)commonService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.badboyh2o.webservice.CommonService_PortType getCommonService_PortType() {
    if (commonService_PortType == null)
      _initCommonServiceProxy();
    return commonService_PortType;
  }
  
  public java.lang.String sayHello(java.lang.String userName) throws java.rmi.RemoteException{
    if (commonService_PortType == null)
      _initCommonServiceProxy();
    return commonService_PortType.sayHello(userName);
  }
  
  
}