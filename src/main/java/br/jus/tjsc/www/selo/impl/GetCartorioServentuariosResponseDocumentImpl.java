/*
 * An XML document type.
 * Localname: getCartorioServentuariosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioServentuariosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioServentuariosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioServentuariosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioServentuariosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOSERVENTUARIOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioServentuariosResponse");
    
    
    /**
     * Gets the "getCartorioServentuariosResponse" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuariosResponse getGetCartorioServentuariosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuariosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuariosResponse)get_store().find_element_user(GETCARTORIOSERVENTUARIOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioServentuariosResponse" element
     */
    public void setGetCartorioServentuariosResponse(br.jus.tjsc.www.selo.GetCartorioServentuariosResponse getCartorioServentuariosResponse)
    {
        generatedSetterHelperImpl(getCartorioServentuariosResponse, GETCARTORIOSERVENTUARIOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioServentuariosResponse" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuariosResponse addNewGetCartorioServentuariosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuariosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuariosResponse)get_store().add_element_user(GETCARTORIOSERVENTUARIOSRESPONSE$0);
            return target;
        }
    }
}
