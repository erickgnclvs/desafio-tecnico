/*
 * An XML document type.
 * Localname: getTiposDeEmail
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEmailDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeEmail(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeEmailDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEmailDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEmailDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEEMAIL$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEmail");
    
    
    /**
     * Gets the "getTiposDeEmail" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEmail getGetTiposDeEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEmail target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEmail)get_store().find_element_user(GETTIPOSDEEMAIL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeEmail" element
     */
    public void setGetTiposDeEmail(br.jus.tjsc.www.selo.GetTiposDeEmail getTiposDeEmail)
    {
        generatedSetterHelperImpl(getTiposDeEmail, GETTIPOSDEEMAIL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeEmail" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEmail addNewGetTiposDeEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEmail target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEmail)get_store().add_element_user(GETTIPOSDEEMAIL$0);
            return target;
        }
    }
}
