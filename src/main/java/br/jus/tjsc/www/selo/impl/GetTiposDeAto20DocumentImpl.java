/*
 * An XML document type.
 * Localname: getTiposDeAto20
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeAto20Document
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeAto20(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeAto20DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeAto20Document
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeAto20DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEATO20$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto20");
    
    
    /**
     * Gets the "getTiposDeAto20" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAto20 getGetTiposDeAto20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAto20 target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAto20)get_store().find_element_user(GETTIPOSDEATO20$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeAto20" element
     */
    public void setGetTiposDeAto20(br.jus.tjsc.www.selo.GetTiposDeAto20 getTiposDeAto20)
    {
        generatedSetterHelperImpl(getTiposDeAto20, GETTIPOSDEATO20$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeAto20" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAto20 addNewGetTiposDeAto20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAto20 target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAto20)get_store().add_element_user(GETTIPOSDEATO20$0);
            return target;
        }
    }
}
