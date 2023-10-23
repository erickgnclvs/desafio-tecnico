/*
 * An XML document type.
 * Localname: getEstadosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEstadosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEstadosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEstadosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEstadosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEstadosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESTADOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEstadosResponse");
    
    
    /**
     * Gets the "getEstadosResponse" element
     */
    public br.jus.tjsc.www.selo.GetEstadosResponse getGetEstadosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstadosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEstadosResponse)get_store().find_element_user(GETESTADOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEstadosResponse" element
     */
    public void setGetEstadosResponse(br.jus.tjsc.www.selo.GetEstadosResponse getEstadosResponse)
    {
        generatedSetterHelperImpl(getEstadosResponse, GETESTADOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEstadosResponse" element
     */
    public br.jus.tjsc.www.selo.GetEstadosResponse addNewGetEstadosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEstadosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetEstadosResponse)get_store().add_element_user(GETESTADOSRESPONSE$0);
            return target;
        }
    }
}
