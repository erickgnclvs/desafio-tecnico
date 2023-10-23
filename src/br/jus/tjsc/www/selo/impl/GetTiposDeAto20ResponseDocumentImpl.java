/*
 * An XML document type.
 * Localname: getTiposDeAto20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeAto20Response(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeAto20ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeAto20ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeAto20ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEATO20RESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAto20Response");
    
    
    /**
     * Gets the "getTiposDeAto20Response" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAto20Response getGetTiposDeAto20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAto20Response target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAto20Response)get_store().find_element_user(GETTIPOSDEATO20RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeAto20Response" element
     */
    public void setGetTiposDeAto20Response(br.jus.tjsc.www.selo.GetTiposDeAto20Response getTiposDeAto20Response)
    {
        generatedSetterHelperImpl(getTiposDeAto20Response, GETTIPOSDEATO20RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeAto20Response" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAto20Response addNewGetTiposDeAto20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAto20Response target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAto20Response)get_store().add_element_user(GETTIPOSDEATO20RESPONSE$0);
            return target;
        }
    }
}
