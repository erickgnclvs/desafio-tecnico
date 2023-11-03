/*
 * An XML document type.
 * Localname: verificaTransmissaoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one verificaTransmissaoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class VerificaTransmissaoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.VerificaTransmissaoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerificaTransmissaoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERIFICATRANSMISSAORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "verificaTransmissaoResponse");
    
    
    /**
     * Gets the "verificaTransmissaoResponse" element
     */
    public br.jus.tjsc.www.selo.VerificaTransmissaoResponse getVerificaTransmissaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.VerificaTransmissaoResponse target = null;
            target = (br.jus.tjsc.www.selo.VerificaTransmissaoResponse)get_store().find_element_user(VERIFICATRANSMISSAORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verificaTransmissaoResponse" element
     */
    public void setVerificaTransmissaoResponse(br.jus.tjsc.www.selo.VerificaTransmissaoResponse verificaTransmissaoResponse)
    {
        generatedSetterHelperImpl(verificaTransmissaoResponse, VERIFICATRANSMISSAORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "verificaTransmissaoResponse" element
     */
    public br.jus.tjsc.www.selo.VerificaTransmissaoResponse addNewVerificaTransmissaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.VerificaTransmissaoResponse target = null;
            target = (br.jus.tjsc.www.selo.VerificaTransmissaoResponse)get_store().add_element_user(VERIFICATRANSMISSAORESPONSE$0);
            return target;
        }
    }
}
