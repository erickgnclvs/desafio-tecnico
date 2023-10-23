/*
 * An XML document type.
 * Localname: getFormasDePagamentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getFormasDePagamentoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetFormasDePagamentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetFormasDePagamentoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetFormasDePagamentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETFORMASDEPAGAMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getFormasDePagamentoResponse");
    
    
    /**
     * Gets the "getFormasDePagamentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetFormasDePagamentoResponse getGetFormasDePagamentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetFormasDePagamentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetFormasDePagamentoResponse)get_store().find_element_user(GETFORMASDEPAGAMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getFormasDePagamentoResponse" element
     */
    public void setGetFormasDePagamentoResponse(br.jus.tjsc.www.selo.GetFormasDePagamentoResponse getFormasDePagamentoResponse)
    {
        generatedSetterHelperImpl(getFormasDePagamentoResponse, GETFORMASDEPAGAMENTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getFormasDePagamentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetFormasDePagamentoResponse addNewGetFormasDePagamentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetFormasDePagamentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetFormasDePagamentoResponse)get_store().add_element_user(GETFORMASDEPAGAMENTORESPONSE$0);
            return target;
        }
    }
}
