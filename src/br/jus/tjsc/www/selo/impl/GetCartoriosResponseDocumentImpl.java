/*
 * An XML document type.
 * Localname: getCartoriosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartoriosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartoriosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartoriosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartoriosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartoriosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartoriosResponse");
    
    
    /**
     * Gets the "getCartoriosResponse" element
     */
    public br.jus.tjsc.www.selo.GetCartoriosResponse getGetCartoriosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartoriosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetCartoriosResponse)get_store().find_element_user(GETCARTORIOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartoriosResponse" element
     */
    public void setGetCartoriosResponse(br.jus.tjsc.www.selo.GetCartoriosResponse getCartoriosResponse)
    {
        generatedSetterHelperImpl(getCartoriosResponse, GETCARTORIOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartoriosResponse" element
     */
    public br.jus.tjsc.www.selo.GetCartoriosResponse addNewGetCartoriosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartoriosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetCartoriosResponse)get_store().add_element_user(GETCARTORIOSRESPONSE$0);
            return target;
        }
    }
}
