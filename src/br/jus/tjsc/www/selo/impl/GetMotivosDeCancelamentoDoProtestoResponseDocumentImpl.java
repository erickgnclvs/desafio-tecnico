/*
 * An XML document type.
 * Localname: getMotivosDeCancelamentoDoProtestoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMotivosDeCancelamentoDoProtestoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMotivosDeCancelamentoDoProtestoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMotivosDeCancelamentoDoProtestoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMOTIVOSDECANCELAMENTODOPROTESTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMotivosDeCancelamentoDoProtestoResponse");
    
    
    /**
     * Gets the "getMotivosDeCancelamentoDoProtestoResponse" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse getGetMotivosDeCancelamentoDoProtestoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse)get_store().find_element_user(GETMOTIVOSDECANCELAMENTODOPROTESTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMotivosDeCancelamentoDoProtestoResponse" element
     */
    public void setGetMotivosDeCancelamentoDoProtestoResponse(br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse getMotivosDeCancelamentoDoProtestoResponse)
    {
        generatedSetterHelperImpl(getMotivosDeCancelamentoDoProtestoResponse, GETMOTIVOSDECANCELAMENTODOPROTESTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMotivosDeCancelamentoDoProtestoResponse" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse addNewGetMotivosDeCancelamentoDoProtestoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeCancelamentoDoProtestoResponse)get_store().add_element_user(GETMOTIVOSDECANCELAMENTODOPROTESTORESPONSE$0);
            return target;
        }
    }
}
