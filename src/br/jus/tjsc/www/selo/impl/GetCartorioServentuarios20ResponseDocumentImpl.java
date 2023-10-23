/*
 * An XML document type.
 * Localname: getCartorioServentuarios20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioServentuarios20Response(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioServentuarios20ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioServentuarios20ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioServentuarios20ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOSERVENTUARIOS20RESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioServentuarios20Response");
    
    
    /**
     * Gets the "getCartorioServentuarios20Response" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuarios20Response getGetCartorioServentuarios20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuarios20Response target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuarios20Response)get_store().find_element_user(GETCARTORIOSERVENTUARIOS20RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioServentuarios20Response" element
     */
    public void setGetCartorioServentuarios20Response(br.jus.tjsc.www.selo.GetCartorioServentuarios20Response getCartorioServentuarios20Response)
    {
        generatedSetterHelperImpl(getCartorioServentuarios20Response, GETCARTORIOSERVENTUARIOS20RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioServentuarios20Response" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuarios20Response addNewGetCartorioServentuarios20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuarios20Response target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuarios20Response)get_store().add_element_user(GETCARTORIOSERVENTUARIOS20RESPONSE$0);
            return target;
        }
    }
}
