/*
 * An XML document type.
 * Localname: getJuizesDePaz20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getJuizesDePaz20Response(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetJuizesDePaz20ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetJuizesDePaz20ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetJuizesDePaz20ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETJUIZESDEPAZ20RESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getJuizesDePaz20Response");
    
    
    /**
     * Gets the "getJuizesDePaz20Response" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePaz20Response getGetJuizesDePaz20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePaz20Response target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePaz20Response)get_store().find_element_user(GETJUIZESDEPAZ20RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getJuizesDePaz20Response" element
     */
    public void setGetJuizesDePaz20Response(br.jus.tjsc.www.selo.GetJuizesDePaz20Response getJuizesDePaz20Response)
    {
        generatedSetterHelperImpl(getJuizesDePaz20Response, GETJUIZESDEPAZ20RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getJuizesDePaz20Response" element
     */
    public br.jus.tjsc.www.selo.GetJuizesDePaz20Response addNewGetJuizesDePaz20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetJuizesDePaz20Response target = null;
            target = (br.jus.tjsc.www.selo.GetJuizesDePaz20Response)get_store().add_element_user(GETJUIZESDEPAZ20RESPONSE$0);
            return target;
        }
    }
}
