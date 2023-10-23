/*
 * An XML document type.
 * Localname: getMunicipios
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMunicipiosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMunicipios(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMunicipiosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMunicipiosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMunicipiosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMUNICIPIOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMunicipios");
    
    
    /**
     * Gets the "getMunicipios" element
     */
    public br.jus.tjsc.www.selo.GetMunicipios getGetMunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMunicipios target = null;
            target = (br.jus.tjsc.www.selo.GetMunicipios)get_store().find_element_user(GETMUNICIPIOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMunicipios" element
     */
    public void setGetMunicipios(br.jus.tjsc.www.selo.GetMunicipios getMunicipios)
    {
        generatedSetterHelperImpl(getMunicipios, GETMUNICIPIOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMunicipios" element
     */
    public br.jus.tjsc.www.selo.GetMunicipios addNewGetMunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMunicipios target = null;
            target = (br.jus.tjsc.www.selo.GetMunicipios)get_store().add_element_user(GETMUNICIPIOS$0);
            return target;
        }
    }
}
