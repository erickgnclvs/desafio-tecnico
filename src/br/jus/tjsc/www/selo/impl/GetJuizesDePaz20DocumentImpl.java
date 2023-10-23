/*
 * An XML document type.
 * Localname: getJuizesDePaz20
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetJuizesDePaz20Document
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getJuizesDePaz20(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetJuizesDePaz20DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetJuizesDePaz20Document
{
    private static final long serialVersionUID = 1L;
    
    public GetJuizesDePaz20DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETJUIZESDEPAZ20$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz20");
    
    
    /**
     * Gets the "getJuizesDePaz20" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePaz20 getGetJuizesDePaz20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePaz20 target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePaz20)get_store().find_element_user(GETJUIZESDEPAZ20$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getJuizesDePaz20" element
     */
    public void setGetJuizesDePaz20(br.jus.tjsc.www.selo.GetJuizesDePaz20 getJuizesDePaz20)
    {
        generatedSetterHelperImpl(getJuizesDePaz20, GETJUIZESDEPAZ20$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getJuizesDePaz20" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePaz20 addNewGetJuizesDePaz20()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePaz20 target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePaz20)get_store().add_element_user(GETJUIZESDEPAZ20$0);
            return target;
        }
    }
}
