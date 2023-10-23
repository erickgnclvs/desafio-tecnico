/*
 * An XML document type.
 * Localname: getTiposDeCobranca20Response
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeCobranca20Response(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeCobranca20ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeCobranca20ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeCobranca20ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDECOBRANCA20RESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeCobranca20Response");
    
    
    /**
     * Gets the "getTiposDeCobranca20Response" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobranca20Response getGetTiposDeCobranca20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobranca20Response target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobranca20Response)get_store().find_element_user(GETTIPOSDECOBRANCA20RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeCobranca20Response" element
     */
    public void setGetTiposDeCobranca20Response(br.jus.tjsc.www.selo.GetTiposDeCobranca20Response getTiposDeCobranca20Response)
    {
        generatedSetterHelperImpl(getTiposDeCobranca20Response, GETTIPOSDECOBRANCA20RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeCobranca20Response" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeCobranca20Response addNewGetTiposDeCobranca20Response()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeCobranca20Response target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeCobranca20Response)get_store().add_element_user(GETTIPOSDECOBRANCA20RESPONSE$0);
            return target;
        }
    }
}
