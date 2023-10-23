/*
 * An XML document type.
 * Localname: getCartorioLivros20
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioLivros20Document
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioLivros20(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioLivros20DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioLivros20Document
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioLivros20DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOLIVROS20$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivros20");
    
    
    /**
     * Gets the "getCartorioLivros20" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivros20 getGetCartorioLivros20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivros20 target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivros20)get_store().find_element_user(GETCARTORIOLIVROS20$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioLivros20" element
     */
    public void setGetCartorioLivros20(br.jus.tjsc.www.selo.GetCartorioLivros20 getCartorioLivros20)
    {
        generatedSetterHelperImpl(getCartorioLivros20, GETCARTORIOLIVROS20$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioLivros20" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivros20 addNewGetCartorioLivros20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivros20 target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivros20)get_store().add_element_user(GETCARTORIOLIVROS20$0);
            return target;
        }
    }
}
