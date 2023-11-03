/*
 * An XML document type.
 * Localname: getCartorioLivros
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioLivrosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioLivros(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioLivrosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioLivrosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioLivrosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOLIVROS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioLivros");
    
    
    /**
     * Gets the "getCartorioLivros" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivros getGetCartorioLivros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivros target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivros)get_store().find_element_user(GETCARTORIOLIVROS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioLivros" element
     */
    public void setGetCartorioLivros(br.jus.tjsc.www.selo.GetCartorioLivros getCartorioLivros)
    {
        generatedSetterHelperImpl(getCartorioLivros, GETCARTORIOLIVROS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioLivros" element
     */
    public br.jus.tjsc.www.selo.GetCartorioLivros addNewGetCartorioLivros()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioLivros target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioLivros)get_store().add_element_user(GETCARTORIOLIVROS$0);
            return target;
        }
    }
}
