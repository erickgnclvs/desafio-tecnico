/*
 * An XML document type.
 * Localname: getBancos
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetBancosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getBancos(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetBancosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetBancosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetBancosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBANCOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getBancos");
    
    
    /**
     * Gets the "getBancos" element
     */
    public br.jus.tjsc.www.selo.GetBancos getGetBancos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetBancos target = null;
            target = (br.jus.tjsc.www.selo.GetBancos)get_store().find_element_user(GETBANCOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBancos" element
     */
    public void setGetBancos(br.jus.tjsc.www.selo.GetBancos getBancos)
    {
        generatedSetterHelperImpl(getBancos, GETBANCOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getBancos" element
     */
    public br.jus.tjsc.www.selo.GetBancos addNewGetBancos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetBancos target = null;
            target = (br.jus.tjsc.www.selo.GetBancos)get_store().add_element_user(GETBANCOS$0);
            return target;
        }
    }
}
