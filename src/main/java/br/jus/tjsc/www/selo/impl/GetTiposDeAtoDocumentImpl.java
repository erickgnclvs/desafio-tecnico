/*
 * An XML document type.
 * Localname: getTiposDeAto
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeAtoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeAto(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeAtoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeAtoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeAtoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEATO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto");
    
    
    /**
     * Gets the "getTiposDeAto" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAto getGetTiposDeAto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAto target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAto)get_store().find_element_user(GETTIPOSDEATO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeAto" element
     */
    public void setGetTiposDeAto(br.jus.tjsc.www.selo.GetTiposDeAto getTiposDeAto)
    {
        generatedSetterHelperImpl(getTiposDeAto, GETTIPOSDEATO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeAto" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAto addNewGetTiposDeAto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAto target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAto)get_store().add_element_user(GETTIPOSDEATO$0);
            return target;
        }
    }
}
