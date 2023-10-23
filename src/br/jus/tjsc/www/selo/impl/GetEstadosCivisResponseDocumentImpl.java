/*
 * An XML document type.
 * Localname: getEstadosCivisResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEstadosCivisResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEstadosCivisResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEstadosCivisResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEstadosCivisResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESTADOSCIVISRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstadosCivisResponse");
    
    
    /**
     * Gets the "getEstadosCivisResponse" element
     */
    public br.jus.tjsc.www.selo.GetEstadosCivisResponse getGetEstadosCivisResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstadosCivisResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEstadosCivisResponse)get_store().find_element_user(GETESTADOSCIVISRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEstadosCivisResponse" element
     */
    public void setGetEstadosCivisResponse(br.jus.tjsc.www.selo.GetEstadosCivisResponse getEstadosCivisResponse)
    {
        generatedSetterHelperImpl(getEstadosCivisResponse, GETESTADOSCIVISRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEstadosCivisResponse" element
     */
    public br.jus.tjsc.www.selo.GetEstadosCivisResponse addNewGetEstadosCivisResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstadosCivisResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEstadosCivisResponse)get_store().add_element_user(GETESTADOSCIVISRESPONSE$0);
            return target;
        }
    }
}
