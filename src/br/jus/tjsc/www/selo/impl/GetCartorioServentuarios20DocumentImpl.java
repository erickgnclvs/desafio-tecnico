/*
 * An XML document type.
 * Localname: getCartorioServentuarios20
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioServentuarios20Document
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioServentuarios20(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioServentuarios20DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioServentuarios20Document
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioServentuarios20DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOSERVENTUARIOS20$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioServentuarios20");
    
    
    /**
     * Gets the "getCartorioServentuarios20" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuarios20 getGetCartorioServentuarios20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuarios20 target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuarios20)get_store().find_element_user(GETCARTORIOSERVENTUARIOS20$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioServentuarios20" element
     */
    public void setGetCartorioServentuarios20(br.jus.tjsc.www.selo.GetCartorioServentuarios20 getCartorioServentuarios20)
    {
        generatedSetterHelperImpl(getCartorioServentuarios20, GETCARTORIOSERVENTUARIOS20$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioServentuarios20" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuarios20 addNewGetCartorioServentuarios20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuarios20 target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuarios20)get_store().add_element_user(GETCARTORIOSERVENTUARIOS20$0);
            return target;
        }
    }
}
