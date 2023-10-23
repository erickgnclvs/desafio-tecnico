/*
 * An XML document type.
 * Localname: getCartorioLivros20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioLivros20Response(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioLivros20ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioLivros20ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioLivros20ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOLIVROS20RESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivros20Response");
    
    
    /**
     * Gets the "getCartorioLivros20Response" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivros20Response getGetCartorioLivros20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivros20Response target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivros20Response)get_store().find_element_user(GETCARTORIOLIVROS20RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioLivros20Response" element
     */
    public void setGetCartorioLivros20Response(br.jus.tjsc.www.selo.GetCartorioLivros20Response getCartorioLivros20Response)
    {
        generatedSetterHelperImpl(getCartorioLivros20Response, GETCARTORIOLIVROS20RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioLivros20Response" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivros20Response addNewGetCartorioLivros20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivros20Response target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivros20Response)get_store().add_element_user(GETCARTORIOLIVROS20RESPONSE$0);
            return target;
        }
    }
}
