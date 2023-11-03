/*
 * An XML document type.
 * Localname: getSelos
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelos(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelos");
    
    
    /**
     * Gets the "getSelos" element
     */
    public br.jus.tjsc.www.selo.GetSelos getGetSelos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelos target = null;
            target = (br.jus.tjsc.www.selo.GetSelos)get_store().find_element_user(GETSELOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelos" element
     */
    public void setGetSelos(br.jus.tjsc.www.selo.GetSelos getSelos)
    {
        generatedSetterHelperImpl(getSelos, GETSELOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelos" element
     */
    public br.jus.tjsc.www.selo.GetSelos addNewGetSelos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelos target = null;
            target = (br.jus.tjsc.www.selo.GetSelos)get_store().add_element_user(GETSELOS$0);
            return target;
        }
    }
}
