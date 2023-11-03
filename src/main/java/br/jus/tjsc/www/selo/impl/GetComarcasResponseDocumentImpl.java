/*
 * An XML document type.
 * Localname: getComarcasResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetComarcasResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getComarcasResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetComarcasResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetComarcasResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetComarcasResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMARCASRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcasResponse");
    
    
    /**
     * Gets the "getComarcasResponse" element
     */
    public br.jus.tjsc.www.selo.GetComarcasResponse getGetComarcasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcasResponse target = null;
            target = (br.jus.tjsc.www.selo.GetComarcasResponse)get_store().find_element_user(GETCOMARCASRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getComarcasResponse" element
     */
    public void setGetComarcasResponse(br.jus.tjsc.www.selo.GetComarcasResponse getComarcasResponse)
    {
        generatedSetterHelperImpl(getComarcasResponse, GETCOMARCASRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getComarcasResponse" element
     */
    public br.jus.tjsc.www.selo.GetComarcasResponse addNewGetComarcasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcasResponse target = null;
            target = (br.jus.tjsc.www.selo.GetComarcasResponse)get_store().add_element_user(GETCOMARCASRESPONSE$0);
            return target;
        }
    }
}
