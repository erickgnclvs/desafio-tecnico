/**
 * SeloServiceStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package samples.service.xmlbeans;

/*
 *  SeloServiceStub java implementation
 */

import org.apache.axis2.transport.TransportUtils;

public class SeloServiceStub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionClassNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultMessageMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("SeloService" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[47];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSituacoesDeTitulo"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobranca"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobranca20"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedido"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.tjsc.jus.br/selo", "getTiposDeSubestabelecimento"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getBancos"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivros20"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEtnias"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.tjsc.jus.br/selo", "getTiposDeRegistroDeAverbacao"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTelefone"));
    _service.addOperation(__operation);

    _operations[10] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTestamento"));
    _service.addOperation(__operation);

    _operations[11] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcas"));
    _service.addOperation(__operation);

    _operations[12] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeDocumento"));
    _service.addOperation(__operation);

    _operations[13] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto"));
    _service.addOperation(__operation);

    _operations[14] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeSelo"));
    _service.addOperation(__operation);

    _operations[15] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMoedas"));
    _service.addOperation(__operation);

    _operations[16] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMotivosDeProtesto"));
    _service.addOperation(__operation);

    _operations[17] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstadosCivis"));
    _service.addOperation(__operation);

    _operations[18] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getPaises"));
    _service.addOperation(__operation);

    _operations[19] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEscolaridades"));
    _service.addOperation(__operation);

    _operations[20] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "verificaTransmissao"));
    _service.addOperation(__operation);

    _operations[21] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEspeciesDeTitulo"));
    _service.addOperation(__operation);

    _operations[22] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedidoCompactados"));
    _service.addOperation(__operation);

    _operations[23] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioServentuarios20"));
    _service.addOperation(__operation);

    _operations[24] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.tjsc.jus.br/selo", "getMotivosDeCancelamentoDoProtesto"));
    _service.addOperation(__operation);

    _operations[25] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "decodificaRecibo"));
    _service.addOperation(__operation);

    _operations[26] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz20"));
    _service.addOperation(__operation);

    _operations[27] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeServentuario"));
    _service.addOperation(__operation);

    _operations[28] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcasMunicipios"));
    _service.addOperation(__operation);

    _operations[29] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioServentuarios"));
    _service.addOperation(__operation);

    _operations[30] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivros"));
    _service.addOperation(__operation);

    _operations[31] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getProfissoes"));
    _service.addOperation(__operation);

    _operations[32] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorios"));
    _service.addOperation(__operation);

    _operations[33] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMunicipios"));
    _service.addOperation(__operation);

    _operations[34] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.tjsc.jus.br/selo", "redisponibilizaUltimaTransmissaoSelos"));
    _service.addOperation(__operation);

    _operations[35] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosCompactados"));
    _service.addOperation(__operation);

    _operations[36] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEndereco"));
    _service.addOperation(__operation);

    _operations[37] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelos"));
    _service.addOperation(__operation);

    _operations[38] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto20"));
    _service.addOperation(__operation);

    _operations[39] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeProcuracao"));
    _service.addOperation(__operation);

    _operations[40] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEndosso"));
    _service.addOperation(__operation);

    _operations[41] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://www.tjsc.jus.br/selo", "getEntesDeclaradosUtilidadePublicaEstadual"));
    _service.addOperation(__operation);

    _operations[42] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "putAtos"));
    _service.addOperation(__operation);

    _operations[43] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstados"));
    _service.addOperation(__operation);

    _operations[44] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getFormasDePagamento"));
    _service.addOperation(__operation);

    _operations[45] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEmail"));
    _service.addOperation(__operation);

    _operations[46] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getJuizesDePaz"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getJuizesDePaz"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getJuizesDePaz"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosPedido"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosPedido"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosPedido"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioLivros20"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioLivros20"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioLivros20"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "verificaTransmissao"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "verificaTransmissao"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "verificaTransmissao"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosPedidoCompactados"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosPedidoCompactados"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosPedidoCompactados"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioServentuarios20"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioServentuarios20"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioServentuarios20"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "decodificaRecibo"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "decodificaRecibo"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "decodificaRecibo"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getJuizesDePaz20"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getJuizesDePaz20"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getJuizesDePaz20"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioServentuarios"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioServentuarios"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioServentuarios"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioLivros"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioLivros"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getCartorioLivros"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "redisponibilizaUltimaTransmissaoSelos"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "redisponibilizaUltimaTransmissaoSelos"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "redisponibilizaUltimaTransmissaoSelos"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosCompactados"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosCompactados"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getSelosCompactados"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"), "getSelos"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"), "getSelos"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"), "getSelos"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getEntesDeclaradosUtilidadePublicaEstadual"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getEntesDeclaradosUtilidadePublicaEstadual"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"),
            "getEntesDeclaradosUtilidadePublicaEstadual"),
        "br.jus.tjsc.www.selo.ExceptionDocument");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"), "putAtos"),
        "samples.service.xmlbeans.ExceptionException");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"), "putAtos"),
        "samples.service.xmlbeans.ExceptionException");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "Exception"), "putAtos"),
        "br.jus.tjsc.www.selo.ExceptionDocument");
  }

  /** Constructor that takes in a configContext */
  public SeloServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public SeloServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint,
      boolean useSeparateListener)
      throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _serviceClient
        .getOptions()
        .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
  }

  /** Default Constructor */
  public SeloServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://selo.tjsc.jus.br/selo_teste/SeloService");
  }

  /** Default Constructor */
  public SeloServiceStub() throws org.apache.axis2.AxisFault {

    this("http://selo.tjsc.jus.br/selo_teste/SeloService");
  }

  /** Constructor taking the target endpoint */
  public SeloServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getSituacoesDeTitulo
   * @param getSituacoesDeTitulo
   */
  public br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument getSituacoesDeTitulo(
      br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument getSituacoesDeTitulo)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getSituacoesDeTitulo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getSituacoesDeTitulo,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getSituacoesDeTitulo")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSituacoesDeTitulo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSituacoesDeTitulo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getSituacoesDeTitulo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getSituacoesDeTitulo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeCobranca
   * @param getTiposDeCobranca
   */
  public br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument getTiposDeCobranca(
      br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument getTiposDeCobranca)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeCobranca");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeCobranca,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeCobranca")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobranca"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeCobranca"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeCobranca"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeCobranca"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeCobranca20
   * @param getTiposDeCobranca20
   */
  public br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument getTiposDeCobranca20(
      br.jus.tjsc.www.selo.GetTiposDeCobranca20Document getTiposDeCobranca20)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeCobranca20");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeCobranca20,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeCobranca20")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobranca20"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeCobranca20"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeCobranca20"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeCobranca20"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getJuizesDePaz
   * @param getJuizesDePaz
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument getJuizesDePaz(
      br.jus.tjsc.www.selo.GetJuizesDePazDocument getJuizesDePaz)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getJuizesDePaz");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getJuizesDePaz,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getJuizesDePaz"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getJuizesDePaz"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getJuizesDePaz"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getSelosPedido
   * @param getSelosPedido
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument getSelosPedido(
      br.jus.tjsc.www.selo.GetSelosPedidoDocument getSelosPedido)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getSelosPedido");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getSelosPedido,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedido")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedido"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSelosPedido"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSelosPedido"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSelosPedido"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeSubestabelecimento
   * @param getTiposDeSubestabelecimento
   */
  public br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument
      getTiposDeSubestabelecimento(
          br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument getTiposDeSubestabelecimento)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeSubestabelecimento");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeSubestabelecimento,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeSubestabelecimento")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getTiposDeSubestabelecimento"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getTiposDeSubestabelecimento"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeSubestabelecimento"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeSubestabelecimento"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getBancos
   * @param getBancos
   */
  public br.jus.tjsc.www.selo.GetBancosResponseDocument getBancos(
      br.jus.tjsc.www.selo.GetBancosDocument getBancos) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("http://www.tjsc.jus.br/selo/SeloService/getBancos");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getBancos,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getBancos")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getBancos"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetBancosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetBancosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getBancos"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getBancos"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getBancos"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getCartorioLivros20
   * @param getCartorioLivros20
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument getCartorioLivros20(
      br.jus.tjsc.www.selo.GetCartorioLivros20Document getCartorioLivros20)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getCartorioLivros20");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getCartorioLivros20,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getCartorioLivros20")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivros20"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCartorioLivros20"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioLivros20"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioLivros20"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getEtnias
   * @param getEtnias
   */
  public br.jus.tjsc.www.selo.GetEtniasResponseDocument getEtnias(
      br.jus.tjsc.www.selo.GetEtniasDocument getEtnias) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("http://www.tjsc.jus.br/selo/SeloService/getEtnias");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getEtnias,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEtnias")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEtnias"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetEtniasResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetEtniasResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEtnias"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEtnias"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEtnias"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeRegistroDeAverbacao
   * @param getTiposDeRegistroDeAverbacao
   */
  public br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument
      getTiposDeRegistroDeAverbacao(
          br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument getTiposDeRegistroDeAverbacao)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeRegistroDeAverbacao");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeRegistroDeAverbacao,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeRegistroDeAverbacao")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getTiposDeRegistroDeAverbacao"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getTiposDeRegistroDeAverbacao"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeRegistroDeAverbacao"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeRegistroDeAverbacao"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeTelefone
   * @param getTiposDeTelefone
   */
  public br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument getTiposDeTelefone(
      br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument getTiposDeTelefone)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeTelefone");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeTelefone,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeTelefone")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTelefone"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeTelefone"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeTelefone"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeTelefone"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeTestamento
   * @param getTiposDeTestamento
   */
  public br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument getTiposDeTestamento(
      br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument getTiposDeTestamento)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[11].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeTestamento");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeTestamento,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeTestamento")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTestamento"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeTestamento"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeTestamento"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeTestamento"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getComarcas
   * @param getComarcas
   */
  public br.jus.tjsc.www.selo.GetComarcasResponseDocument getComarcas(
      br.jus.tjsc.www.selo.GetComarcasDocument getComarcas) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[12].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getComarcas");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getComarcas,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcas")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcas"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetComarcasResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetComarcasResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getComarcas"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getComarcas"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getComarcas"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeDocumento
   * @param getTiposDeDocumento
   */
  public br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument getTiposDeDocumento(
      br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument getTiposDeDocumento)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[13].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeDocumento");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeDocumento,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeDocumento")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeDocumento"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeDocumento"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeDocumento"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeDocumento"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeAto
   * @param getTiposDeAto
   */
  public br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument getTiposDeAto(
      br.jus.tjsc.www.selo.GetTiposDeAtoDocument getTiposDeAto) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[14].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeAto");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeAto,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeAto"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeAto"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeAto"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeSelo
   * @param getTiposDeSelo
   */
  public br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument getTiposDeSelo(
      br.jus.tjsc.www.selo.GetTiposDeSeloDocument getTiposDeSelo) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[15].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeSelo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeSelo,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeSelo")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeSelo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeSelo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeSelo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeSelo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getMoedas
   * @param getMoedas
   */
  public br.jus.tjsc.www.selo.GetMoedasResponseDocument getMoedas(
      br.jus.tjsc.www.selo.GetMoedasDocument getMoedas) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[16].getName());
      _operationClient.getOptions().setAction("http://www.tjsc.jus.br/selo/SeloService/getMoedas");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getMoedas,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMoedas")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMoedas"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetMoedasResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetMoedasResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getMoedas"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getMoedas"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getMoedas"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getMotivosDeProtesto
   * @param getMotivosDeProtesto
   */
  public br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument getMotivosDeProtesto(
      br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument getMotivosDeProtesto)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[17].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getMotivosDeProtesto");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getMotivosDeProtesto,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getMotivosDeProtesto")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMotivosDeProtesto"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getMotivosDeProtesto"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getMotivosDeProtesto"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getMotivosDeProtesto"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getEstadosCivis
   * @param getEstadosCivis
   */
  public br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument getEstadosCivis(
      br.jus.tjsc.www.selo.GetEstadosCivisDocument getEstadosCivis)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[18].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getEstadosCivis");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getEstadosCivis,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstadosCivis")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstadosCivis"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEstadosCivis"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEstadosCivis"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEstadosCivis"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getPaises
   * @param getPaises
   */
  public br.jus.tjsc.www.selo.GetPaisesResponseDocument getPaises(
      br.jus.tjsc.www.selo.GetPaisesDocument getPaises) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[19].getName());
      _operationClient.getOptions().setAction("http://www.tjsc.jus.br/selo/SeloService/getPaises");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getPaises,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getPaises")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getPaises"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetPaisesResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetPaisesResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPaises"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPaises"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getPaises"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getEscolaridades
   * @param getEscolaridades
   */
  public br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument getEscolaridades(
      br.jus.tjsc.www.selo.GetEscolaridadesDocument getEscolaridades)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[20].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getEscolaridades");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getEscolaridades,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEscolaridades")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEscolaridades"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEscolaridades"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEscolaridades"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEscolaridades"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#verificaTransmissao
   * @param verificaTransmissao
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument verificaTransmissao(
      br.jus.tjsc.www.selo.VerificaTransmissaoDocument verificaTransmissao)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[21].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/verificaTransmissao");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              verificaTransmissao,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "verificaTransmissao")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "verificaTransmissao"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "verificaTransmissao"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "verificaTransmissao"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "verificaTransmissao"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getEspeciesDeTitulo
   * @param getEspeciesDeTitulo
   */
  public br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument getEspeciesDeTitulo(
      br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument getEspeciesDeTitulo)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[22].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getEspeciesDeTitulo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getEspeciesDeTitulo,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getEspeciesDeTitulo")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEspeciesDeTitulo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEspeciesDeTitulo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEspeciesDeTitulo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEspeciesDeTitulo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getSelosPedidoCompactados
   * @param getSelosPedidoCompactados
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument getSelosPedidoCompactados(
      br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument getSelosPedidoCompactados)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[23].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getSelosPedidoCompactados");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getSelosPedidoCompactados,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getSelosPedidoCompactados")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getSelosPedidoCompactados"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getSelosPedidoCompactados"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getSelosPedidoCompactados"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getSelosPedidoCompactados"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getCartorioServentuarios20
   * @param getCartorioServentuarios20
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument getCartorioServentuarios20(
      br.jus.tjsc.www.selo.GetCartorioServentuarios20Document getCartorioServentuarios20)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[24].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getCartorioServentuarios20");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getCartorioServentuarios20,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getCartorioServentuarios20")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getCartorioServentuarios20"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getCartorioServentuarios20"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioServentuarios20"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioServentuarios20"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getMotivosDeCancelamentoDoProtesto
   * @param getMotivosDeCancelamentoDoProtesto
   */
  public br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument
      getMotivosDeCancelamentoDoProtesto(
          br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument
              getMotivosDeCancelamentoDoProtesto)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[25].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getMotivosDeCancelamentoDoProtesto");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getMotivosDeCancelamentoDoProtesto,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getMotivosDeCancelamentoDoProtesto")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getMotivosDeCancelamentoDoProtesto"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getMotivosDeCancelamentoDoProtesto"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getMotivosDeCancelamentoDoProtesto"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getMotivosDeCancelamentoDoProtesto"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#decodificaRecibo
   * @param decodificaRecibo
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.DecodificaReciboResponseDocument decodificaRecibo(
      br.jus.tjsc.www.selo.DecodificaReciboDocument decodificaRecibo)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[26].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/decodificaRecibo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              decodificaRecibo,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "decodificaRecibo")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "decodificaRecibo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.DecodificaReciboResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.DecodificaReciboResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "decodificaRecibo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "decodificaRecibo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "decodificaRecibo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getJuizesDePaz20
   * @param getJuizesDePaz20
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument getJuizesDePaz20(
      br.jus.tjsc.www.selo.GetJuizesDePaz20Document getJuizesDePaz20)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[27].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getJuizesDePaz20");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getJuizesDePaz20,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz20")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz20"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getJuizesDePaz20"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getJuizesDePaz20"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getJuizesDePaz20"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeServentuario
   * @param getTiposDeServentuario
   */
  public br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument getTiposDeServentuario(
      br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument getTiposDeServentuario)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[28].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeServentuario");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeServentuario,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeServentuario")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getTiposDeServentuario"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getTiposDeServentuario"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeServentuario"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeServentuario"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getComarcasMunicipios
   * @param getComarcasMunicipios
   */
  public br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument getComarcasMunicipios(
      br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument getComarcasMunicipios)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[29].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getComarcasMunicipios");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getComarcasMunicipios,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getComarcasMunicipios")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getComarcasMunicipios"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getComarcasMunicipios"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getComarcasMunicipios"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getComarcasMunicipios"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getCartorioServentuarios
   * @param getCartorioServentuarios
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument getCartorioServentuarios(
      br.jus.tjsc.www.selo.GetCartorioServentuariosDocument getCartorioServentuarios)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[30].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getCartorioServentuarios");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getCartorioServentuarios,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getCartorioServentuarios")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getCartorioServentuarios"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getCartorioServentuarios"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioServentuarios"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioServentuarios"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getCartorioLivros
   * @param getCartorioLivros
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument getCartorioLivros(
      br.jus.tjsc.www.selo.GetCartorioLivrosDocument getCartorioLivros)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[31].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getCartorioLivros");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getCartorioLivros,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getCartorioLivros")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivros"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCartorioLivros"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioLivros"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getCartorioLivros"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getProfissoes
   * @param getProfissoes
   */
  public br.jus.tjsc.www.selo.GetProfissoesResponseDocument getProfissoes(
      br.jus.tjsc.www.selo.GetProfissoesDocument getProfissoes) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[32].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getProfissoes");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getProfissoes,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getProfissoes")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getProfissoes"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetProfissoesResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetProfissoesResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getProfissoes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getProfissoes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getProfissoes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getCartorios
   * @param getCartorios
   */
  public br.jus.tjsc.www.selo.GetCartoriosResponseDocument getCartorios(
      br.jus.tjsc.www.selo.GetCartoriosDocument getCartorios) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[33].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getCartorios");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getCartorios,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorios")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorios"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetCartoriosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetCartoriosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCartorios"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCartorios"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getCartorios"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getMunicipios
   * @param getMunicipios
   */
  public br.jus.tjsc.www.selo.GetMunicipiosResponseDocument getMunicipios(
      br.jus.tjsc.www.selo.GetMunicipiosDocument getMunicipios) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[34].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getMunicipios");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getMunicipios,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMunicipios")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMunicipios"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetMunicipiosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetMunicipiosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getMunicipios"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getMunicipios"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getMunicipios"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#redisponibilizaUltimaTransmissaoSelos
   * @param redisponibilizaUltimaTransmissaoSelos
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument
      redisponibilizaUltimaTransmissaoSelos(
          br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument
              redisponibilizaUltimaTransmissaoSelos)
          throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[35].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.tjsc.jus.br/selo/SeloService/redisponibilizaUltimaTransmissaoSelos");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              redisponibilizaUltimaTransmissaoSelos,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "redisponibilizaUltimaTransmissaoSelos")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "redisponibilizaUltimaTransmissaoSelos"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "redisponibilizaUltimaTransmissaoSelos"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "redisponibilizaUltimaTransmissaoSelos"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "redisponibilizaUltimaTransmissaoSelos"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getSelosCompactados
   * @param getSelosCompactados
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument getSelosCompactados(
      br.jus.tjsc.www.selo.GetSelosCompactadosDocument getSelosCompactados)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[36].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getSelosCompactados");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getSelosCompactados,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getSelosCompactados")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosCompactados"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSelosCompactados"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getSelosCompactados"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getSelosCompactados"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeEndereco
   * @param getTiposDeEndereco
   */
  public br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument getTiposDeEndereco(
      br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument getTiposDeEndereco)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[37].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeEndereco");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeEndereco,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeEndereco")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEndereco"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeEndereco"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeEndereco"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeEndereco"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getSelos
   * @param getSelos
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetSelosResponseDocument getSelos(
      br.jus.tjsc.www.selo.GetSelosDocument getSelos)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[38].getName());
      _operationClient.getOptions().setAction("http://www.tjsc.jus.br/selo/SeloService/getSelos");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getSelos,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelos")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelos"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetSelosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetSelosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSelos"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSelos"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getSelos"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeAto20
   * @param getTiposDeAto20
   */
  public br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument getTiposDeAto20(
      br.jus.tjsc.www.selo.GetTiposDeAto20Document getTiposDeAto20)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[39].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeAto20");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeAto20,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto20")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto20"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeAto20"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeAto20"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeAto20"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeProcuracao
   * @param getTiposDeProcuracao
   */
  public br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument getTiposDeProcuracao(
      br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument getTiposDeProcuracao)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[40].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeProcuracao");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeProcuracao,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeProcuracao")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeProcuracao"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeProcuracao"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeProcuracao"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeProcuracao"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeEndosso
   * @param getTiposDeEndosso
   */
  public br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument getTiposDeEndosso(
      br.jus.tjsc.www.selo.GetTiposDeEndossoDocument getTiposDeEndosso)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[41].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeEndosso");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeEndosso,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getTiposDeEndosso")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEndosso"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeEndosso"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeEndosso"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeEndosso"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getEntesDeclaradosUtilidadePublicaEstadual
   * @param getEntesDeclaradosUtilidadePublicaEstadual
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument
      getEntesDeclaradosUtilidadePublicaEstadual(
          br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument
              getEntesDeclaradosUtilidadePublicaEstadual)
          throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[42].getName());
      _operationClient
          .getOptions()
          .setAction(
              "http://www.tjsc.jus.br/selo/SeloService/getEntesDeclaradosUtilidadePublicaEstadual");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getEntesDeclaradosUtilidadePublicaEstadual,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getEntesDeclaradosUtilidadePublicaEstadual")),
              new javax.xml.namespace.QName(
                  "http://www.tjsc.jus.br/selo", "getEntesDeclaradosUtilidadePublicaEstadual"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument
                  .class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getEntesDeclaradosUtilidadePublicaEstadual"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEntesDeclaradosUtilidadePublicaEstadual"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getEntesDeclaradosUtilidadePublicaEstadual"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#putAtos
   * @param putAtos
   * @throws samples.service.xmlbeans.ExceptionException :
   */
  public br.jus.tjsc.www.selo.PutAtosResponseDocument putAtos(
      br.jus.tjsc.www.selo.PutAtosDocument putAtos)
      throws java.rmi.RemoteException, samples.service.xmlbeans.ExceptionException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[43].getName());
      _operationClient.getOptions().setAction("http://www.tjsc.jus.br/selo/SeloService/putAtos");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              putAtos,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "putAtos")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "putAtos"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.PutAtosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.PutAtosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "putAtos"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "putAtos"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "putAtos"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof samples.service.xmlbeans.ExceptionException) {
              throw (samples.service.xmlbeans.ExceptionException) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getEstados
   * @param getEstados
   */
  public br.jus.tjsc.www.selo.GetEstadosResponseDocument getEstados(
      br.jus.tjsc.www.selo.GetEstadosDocument getEstados) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[44].getName());
      _operationClient.getOptions().setAction("http://www.tjsc.jus.br/selo/SeloService/getEstados");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getEstados,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstados")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstados"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetEstadosResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetEstadosResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEstados"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEstados"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getEstados"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getFormasDePagamento
   * @param getFormasDePagamento
   */
  public br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument getFormasDePagamento(
      br.jus.tjsc.www.selo.GetFormasDePagamentoDocument getFormasDePagamento)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[45].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getFormasDePagamento");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getFormasDePagamento,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://www.tjsc.jus.br/selo", "getFormasDePagamento")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getFormasDePagamento"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getFormasDePagamento"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getFormasDePagamento"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getFormasDePagamento"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see samples.service.xmlbeans.SeloServiceStub#getTiposDeEmail
   * @param getTiposDeEmail
   */
  public br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument getTiposDeEmail(
      br.jus.tjsc.www.selo.GetTiposDeEmailDocument getTiposDeEmail)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[46].getName());
      _operationClient
          .getOptions()
          .setAction("http://www.tjsc.jus.br/selo/SeloService/getTiposDeEmail");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getTiposDeEmail,
              optimizeContent(
                  new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEmail")),
              new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEmail"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument.class);
      TransportUtils.detachInputStream(_returnMessageContext);

      return (br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getTiposDeEmail"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeEmail"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getTiposDeEmail"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }
  // http://selo.tjsc.jus.br/selo_teste/SeloService

  private final org.apache.xmlbeans.XmlOptions _xmlOptions;

  {
    _xmlOptions = new org.apache.xmlbeans.XmlOptions();
    _xmlOptions.setSaveNoXmlDecl();
    _xmlOptions.setSaveAggressiveNamespaces();
    _xmlOptions.setSaveNamespacesFirst();
  }

  /**
   * Get the {@link org.apache.xmlbeans.XmlOptions} object that the stub uses when serializing
   * objects to XML.
   *
   * @return the options used for serialization
   */
  public org.apache.xmlbeans.XmlOptions _getXmlOptions() {
    return _xmlOptions;
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeCobranca20Document param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeCobranca20Document param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetJuizesDePazDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetJuizesDePazDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.ExceptionDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.ExceptionDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosPedidoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSelosPedidoDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetBancosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetBancosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetBancosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetBancosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioLivros20Document param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioLivros20Document param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEtniasDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetEtniasDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEtniasResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEtniasResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetComarcasDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetComarcasDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetComarcasResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetComarcasResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeAtoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetTiposDeAtoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeSeloDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeSeloDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMoedasDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetMoedasDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMoedasResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetMoedasResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEstadosCivisDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEstadosCivisDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetPaisesDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetPaisesDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetPaisesResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetPaisesResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEscolaridadesDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEscolaridadesDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.VerificaTransmissaoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.VerificaTransmissaoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioServentuarios20Document param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioServentuarios20Document param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.DecodificaReciboDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.DecodificaReciboDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.DecodificaReciboResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.DecodificaReciboResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetJuizesDePaz20Document param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetJuizesDePaz20Document param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioServentuariosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioServentuariosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioLivrosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioLivrosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetProfissoesDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetProfissoesDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetProfissoesResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetProfissoesResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartoriosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetCartoriosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetCartoriosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetCartoriosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMunicipiosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetMunicipiosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetMunicipiosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetMunicipiosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosCompactadosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSelosCompactadosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetSelosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetSelosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetSelosResponseDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeAto20Document param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeAto20Document param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeEndossoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeEndossoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.PutAtosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.PutAtosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.PutAtosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.PutAtosResponseDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEstadosDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(final br.jus.tjsc.www.selo.GetEstadosDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetEstadosResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetEstadosResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetFormasDePagamentoDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetFormasDePagamentoDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeEmailDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeEmailDocument param) throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    return toOM(param);
  }

  private org.apache.axiom.om.OMElement toOM(
      final br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument param)
      throws org.apache.axis2.AxisFault {

    org.apache.axiom.om.OMXMLParserWrapper builder =
        org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
            new javax.xml.transform.sax.SAXSource(
                new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, _xmlOptions),
                new org.xml.sax.InputSource()));
    try {
      return builder.getDocumentElement(true);
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeCobranca20Document param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetJuizesDePazDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetSelosPedidoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetBancosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetCartorioLivros20Document param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetEtniasDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetComarcasDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeAtoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeSeloDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetMoedasDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetEstadosCivisDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetPaisesDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetEscolaridadesDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.VerificaTransmissaoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetCartorioServentuarios20Document param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.DecodificaReciboDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetJuizesDePaz20Document param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetCartorioServentuariosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetCartorioLivrosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetProfissoesDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetCartoriosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetMunicipiosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetSelosCompactadosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetSelosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeAto20Document param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeEndossoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.PutAtosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetEstadosDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetFormasDePagamentoDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      br.jus.tjsc.www.selo.GetTiposDeEmailDocument param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
    if (param != null) {
      envelope.getBody().addChild(toOM(param, optimizeContent));
    }
    return envelope;
  }

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  public org.apache.xmlbeans.XmlObject fromOM(
      org.apache.axiom.om.OMElement param, java.lang.Class type) throws org.apache.axis2.AxisFault {
    try {

      if (br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSituacoesDeTituloDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSituacoesDeTituloResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeCobrancaDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeCobrancaResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeCobranca20Document.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeCobranca20Document.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetJuizesDePazDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetJuizesDePazDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetJuizesDePazResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosPedidoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosPedidoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosPedidoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeSubestabelecimentoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetBancosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetBancosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetBancosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetBancosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioLivros20Document.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioLivros20Document.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEtniasDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEtniasDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEtniasResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEtniasResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeRegistroDeAverbacaoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeTelefoneDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeTestamentoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeTestamentoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetComarcasDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetComarcasDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetComarcasResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetComarcasResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeDocumentoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeAtoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeAtoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeSeloDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeSeloDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMoedasDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMoedasDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMoedasResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMoedasResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMotivosDeProtestoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEstadosCivisDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEstadosCivisDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetPaisesDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetPaisesDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetPaisesResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetPaisesResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEscolaridadesDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEscolaridadesDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEscolaridadesResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.VerificaTransmissaoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.VerificaTransmissaoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEspeciesDeTituloDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEspeciesDeTituloResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosPedidoCompactadosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioServentuarios20Document.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioServentuarios20Document.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.DecodificaReciboDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.DecodificaReciboDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.DecodificaReciboResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.DecodificaReciboResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetJuizesDePaz20Document.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetJuizesDePaz20Document.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeServentuarioDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetComarcasMunicipiosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioServentuariosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioServentuariosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioLivrosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioLivrosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetProfissoesDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetProfissoesDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetProfissoesResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetProfissoesResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartoriosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartoriosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetCartoriosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetCartoriosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMunicipiosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMunicipiosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetMunicipiosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetMunicipiosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.RedisponibilizaUltimaTransmissaoSelosResponseDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosCompactadosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosCompactadosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosCompactadosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeEnderecoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetSelosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetSelosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeAto20Document.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeAto20Document.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeProcuracaoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeEndossoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeEndossoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeEndossoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument.class.equals(
          type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument.Factory
            .parse(param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument.class
          .equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponseDocument
            .Factory.parse(param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.PutAtosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.PutAtosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.PutAtosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.PutAtosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.ExceptionDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.ExceptionDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEstadosDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEstadosDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetEstadosResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetEstadosResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetFormasDePagamentoDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetFormasDePagamentoDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeEmailDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeEmailDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

      if (br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument.class.equals(type)) {
        org.apache.axiom.om.OMXMLStreamReaderConfiguration configuration =
            new org.apache.axiom.om.OMXMLStreamReaderConfiguration();
        configuration.setPreserveNamespaceContext(true);
        return br.jus.tjsc.www.selo.GetTiposDeEmailResponseDocument.Factory.parse(
            param.getXMLStreamReader(false, configuration));
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}
