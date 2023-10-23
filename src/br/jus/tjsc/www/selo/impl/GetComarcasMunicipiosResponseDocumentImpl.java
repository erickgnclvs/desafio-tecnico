/*
 * An XML document type.
 * Localname: getComarcasMunicipiosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getComarcasMunicipiosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetComarcasMunicipiosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetComarcasMunicipiosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetComarcasMunicipiosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMARCASMUNICIPIOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getComarcasMunicipiosResponse");
    
    
    /**
     * Gets the "getComarcasMunicipiosResponse" element
     */
    public br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse getGetComarcasMunicipiosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse)get_store().find_element_user(GETCOMARCASMUNICIPIOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getComarcasMunicipiosResponse" element
     */
    public void setGetComarcasMunicipiosResponse(br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse getComarcasMunicipiosResponse)
    {
        generatedSetterHelperImpl(getComarcasMunicipiosResponse, GETCOMARCASMUNICIPIOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getComarcasMunicipiosResponse" element
     */
    public br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse addNewGetComarcasMunicipiosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse)get_store().add_element_user(GETCOMARCASMUNICIPIOSRESPONSE$0);
            return target;
        }
    }
}
