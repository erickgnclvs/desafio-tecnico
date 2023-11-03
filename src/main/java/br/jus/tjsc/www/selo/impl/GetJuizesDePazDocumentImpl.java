/*
 * An XML document type.
 * Localname: getJuizesDePaz
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetJuizesDePazDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getJuizesDePaz(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetJuizesDePazDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetJuizesDePazDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetJuizesDePazDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETJUIZESDEPAZ$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz");
    
    
    /**
     * Gets the "getJuizesDePaz" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePaz getGetJuizesDePaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePaz target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePaz)get_store().find_element_user(GETJUIZESDEPAZ$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getJuizesDePaz" element
     */
    public void setGetJuizesDePaz(br.jus.tjsc.www.selo.GetJuizesDePaz getJuizesDePaz)
    {
        generatedSetterHelperImpl(getJuizesDePaz, GETJUIZESDEPAZ$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getJuizesDePaz" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePaz addNewGetJuizesDePaz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePaz target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePaz)get_store().add_element_user(GETJUIZESDEPAZ$0);
            return target;
        }
    }
}
