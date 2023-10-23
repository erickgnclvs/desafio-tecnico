/*
 * An XML document type.
 * Localname: getTiposDeEndosso
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEndossoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeEndosso(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeEndossoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEndossoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEndossoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEENDOSSO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEndosso");
    
    
    /**
     * Gets the "getTiposDeEndosso" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEndosso getGetTiposDeEndosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEndosso target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEndosso)get_store().find_element_user(GETTIPOSDEENDOSSO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeEndosso" element
     */
    public void setGetTiposDeEndosso(br.jus.tjsc.www.selo.GetTiposDeEndosso getTiposDeEndosso)
    {
        generatedSetterHelperImpl(getTiposDeEndosso, GETTIPOSDEENDOSSO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeEndosso" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEndosso addNewGetTiposDeEndosso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEndosso target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEndosso)get_store().add_element_user(GETTIPOSDEENDOSSO$0);
            return target;
        }
    }
}
