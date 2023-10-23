/*
 * An XML document type.
 * Localname: getCartorioLivrosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioLivrosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioLivrosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioLivrosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioLivrosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOLIVROSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivrosResponse");
    
    
    /**
     * Gets the "getCartorioLivrosResponse" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivrosResponse getGetCartorioLivrosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivrosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivrosResponse)get_store().find_element_user(GETCARTORIOLIVROSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioLivrosResponse" element
     */
    public void setGetCartorioLivrosResponse(br.jus.tjsc.www.selo.GetCartorioLivrosResponse getCartorioLivrosResponse)
    {
        generatedSetterHelperImpl(getCartorioLivrosResponse, GETCARTORIOLIVROSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioLivrosResponse" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivrosResponse addNewGetCartorioLivrosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivrosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivrosResponse)get_store().add_element_user(GETCARTORIOLIVROSRESPONSE$0);
            return target;
        }
    }
}
