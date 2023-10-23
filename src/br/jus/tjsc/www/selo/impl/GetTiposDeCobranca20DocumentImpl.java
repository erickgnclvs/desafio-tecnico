/*
 * An XML document type.
 * Localname: getTiposDeCobranca20
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeCobranca20Document
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeCobranca20(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeCobranca20DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeCobranca20Document
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeCobranca20DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDECOBRANCA20$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobranca20");
    
    
    /**
     * Gets the "getTiposDeCobranca20" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobranca20 getGetTiposDeCobranca20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobranca20 target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobranca20)get_store().find_element_user(GETTIPOSDECOBRANCA20$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeCobranca20" element
     */
    public void setGetTiposDeCobranca20(br.jus.tjsc.www.selo.GetTiposDeCobranca20 getTiposDeCobranca20)
    {
        generatedSetterHelperImpl(getTiposDeCobranca20, GETTIPOSDECOBRANCA20$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeCobranca20" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobranca20 addNewGetTiposDeCobranca20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobranca20 target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobranca20)get_store().add_element_user(GETTIPOSDECOBRANCA20$0);
            return target;
        }
    }
}
