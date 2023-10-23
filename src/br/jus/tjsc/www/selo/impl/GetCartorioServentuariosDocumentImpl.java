/*
 * An XML document type.
 * Localname: getCartorioServentuarios
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetCartorioServentuariosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getCartorioServentuarios(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetCartorioServentuariosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetCartorioServentuariosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCartorioServentuariosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCARTORIOSERVENTUARIOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getCartorioServentuarios");
    
    
    /**
     * Gets the "getCartorioServentuarios" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuarios getGetCartorioServentuarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuarios target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuarios)get_store().find_element_user(GETCARTORIOSERVENTUARIOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getCartorioServentuarios" element
     */
    public void setGetCartorioServentuarios(br.jus.tjsc.www.selo.GetCartorioServentuarios getCartorioServentuarios)
    {
        generatedSetterHelperImpl(getCartorioServentuarios, GETCARTORIOSERVENTUARIOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getCartorioServentuarios" element
     */
    public br.jus.tjsc.www.selo.GetCartorioServentuarios addNewGetCartorioServentuarios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetCartorioServentuarios target = null;
            target = (br.jus.tjsc.www.selo.GetCartorioServentuarios)get_store().add_element_user(GETCARTORIOSERVENTUARIOS$0);
            return target;
        }
    }
}
